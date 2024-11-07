package com.example.hello.users.repository;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.hello.users.entity.UserEntity;
import com.example.hello.users.repository.UserRepository;

@Repository
public class UserRepository {
    private final List<UserEntity> users = new ArrayList<>();
    
    public List<UserEntity> findAllUsers() {
        var clarkKent = new UserEntity();
        clarkKent.setId(UUID.randomUUID());
        clarkKent.setFirstName("Clark");
        clarkKent.setLastName("Kent");
        clarkKent.setEmail("clark.kent@dc.com");
        clarkKent.setPassword("clark.kent.01$");
        clarkKent.setCreatedAt(Instant.parse("1900-01-02T00:15:00Z"));
        clarkKent.setUpdatedAt(clarkKent.getCreatedAt());

        var bruceWayne = new UserEntity();
        bruceWayne.setId(UUID.randomUUID());
        bruceWayne.setFirstName("Bruce");
        bruceWayne.setLastName("Wayne");
        bruceWayne.setEmail("bruce.wayne@dc.com");
        bruceWayne.setPassword("wayne.bruce._*$");
        bruceWayne.setCreatedAt(Instant.parse("1901-01-02T00:15:00Z"));
        bruceWayne.setUpdatedAt(clarkKent.getCreatedAt());

        users.addAll(
            List.of(clarkKent, bruceWayne)
        );
        return users;
    }

    //private final UserRepository userRepository;
    //private UserRepository users;

    //private List<UserEntity> allUsers = this.findAllUsers();
    //public UserEntity findUserById(UUID userId) {
    public UserEntity findUserById(UUID userId) {
        //System.out.println(userId);
        //var user = new UserEntity();
        //return user.getId(userId);
        //return users.get(0);
        //throw new UnsupportedOperationException("Unimplemented method 'findUserById'");
        //return allUsers[0];
        return users.stream().filter(item -> item.getId().equals(userId)).toList().get(0);
    }
}
