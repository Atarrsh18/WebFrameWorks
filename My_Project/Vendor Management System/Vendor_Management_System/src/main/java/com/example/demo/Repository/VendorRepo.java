package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.VendorEntity;

import jakarta.transaction.Transactional;

public interface VendorRepo extends JpaRepository<VendorEntity, Integer>{
	@Query(value = "SELECT * FROM vendor ORDER BY id", nativeQuery = true)
	public List<VendorEntity> sortbytid();
	@Query(value="select * from vendors",nativeQuery=true)

	public List<VendorEntity>fetchAll(); 

	@Query(value="select * from vendor  where id= :pid or firstname= :pname",nativeQuery=true)

	public List<VendorEntity> fetchByNameAndId(@Param("pid") int vendorid,@Param("pname") String name);

	@Transactional

	@Modifying

	@Query(value="delete from vendor where id= :para",nativeQuery = true )

	public void deletemebyid(@Param("para") int id);

	@Transactional

	@Modifying

	@Query(value="update vendor set id= ?2 where id= ?1",nativeQuery = true )

	public void updatemebyid( int oldid,int newid);
}
