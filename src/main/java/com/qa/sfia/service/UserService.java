package com.qa.sfia.service;
import com.qa.sfia.domain.User;
import com.qa.sfia.dto.UserDTO;
import com.qa.sfia.exceptions.UserNotFoundException;
import com.qa.sfia.repo.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository repo;

    private final ModelMapper mapper;

    @Autowired
    public UserService(UserRepository repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    private UserDTO mapToDTO(User user){
        return this.mapper.map(user, UserDTO.class);
    }

    public List<UserDTO> readAllUsers() {
        return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public UserDTO createUser(User user){
        return this.mapToDTO(this.repo.save(user));
    }

    public UserDTO findUserById(Long id){
        return this.mapToDTO(this.repo.findById(id)
                .orElseThrow(UserNotFoundException::new));
    }

    public UserDTO updateUser(Long id, User user){
        User update = this.repo.findById(id).orElseThrow(UserNotFoundException::new);
        update.setUserName(user.getUserName());
        update.setfName(user.getfName());
        update.setlName(user.getlName());
        update.setEmail(user.getEmail());
        update.setPassword(user.getPassword());
        return this.mapToDTO(this.repo.save(user));
    }

    public Boolean deleteUserById(Long id){
        if(!this.repo.existsById(id)){
            throw new UserNotFoundException();
        }
        this.repo.deleteById(id);
        return this.repo.existsById(id);
    }
}
