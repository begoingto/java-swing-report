/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.begoingto.app.services;

import com.begoingto.app.models.User;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author begoingtodev
 */
public interface UserService {
    List<User> getAll();
    User addUser(User user);
    void updateUser(Integer index,User user);
    void deleteUser(User user);
    User getByUuid(UUID uuid);
}
