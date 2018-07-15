package demo.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseDao<T,ID extends Serializable> /*extends JpaRepository<T,ID>*/ {

}
