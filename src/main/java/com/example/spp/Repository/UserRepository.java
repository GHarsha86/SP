package com.example.spp.Repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spp.Modal.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value ="select * from user where user.user_name= user_name and user.password= password", nativeQuery=true)
	List<User> login(String user_name, String password);
	
	@Query(value ="select * from user where user.user_id = user_id and user.user_name = user_name and user.password = password", nativeQuery=true)
	List<User> getDetails(long user_id, String user_name, String password);


}
