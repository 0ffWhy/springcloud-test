package cn.ztzh.springcloud.dao;

import cn.ztzh.springcloud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * @author Bear
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

