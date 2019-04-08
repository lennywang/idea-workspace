package dao;

import entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * create by jack 2017/10/18
 */
public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
    SysUser findByUsername(String username);
}
