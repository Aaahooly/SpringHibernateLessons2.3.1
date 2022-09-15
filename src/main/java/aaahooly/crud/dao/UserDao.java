package aaahooly.crud.dao;

import aaahooly.crud.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface UserDao  {

    public List<User> index();

    public User show(int idUser);

    public void saveUser(User user);
//
//    public void deleteUser(int idUser);

    void deleteUser(int idUser);

    public void updateUser(int idUser, User user);
}
