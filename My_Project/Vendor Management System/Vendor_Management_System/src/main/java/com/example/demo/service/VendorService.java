package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.VendorRepo;
import com.example.demo.model.VendorEntity;

@Service
public class VendorService {
@Autowired
VendorRepo vr;
public VendorEntity saveinfo(VendorEntity ve)
{
	return vr.save(ve);
}
public List<VendorEntity> showinfo()
{
	return vr.findAll();
}
public List<VendorEntity> savedetails(List<VendorEntity> ve)
{
	return (List<VendorEntity>)vr.saveAll(ve);
}
public VendorEntity changeinfo(VendorEntity ve)
{
	return vr.saveAndFlush(ve);
}
public void deleteinfo(VendorEntity ve)
{
	vr.delete(ve);
}
public void deleteid(int id)
{
	 vr.deleteById(id);
} 
public Optional<VendorEntity> getVendorById(int id)   
{  
          return vr.findById(id);  
}

public List<VendorEntity> sortinfo(String name)
{
	return vr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,name));
}

public List<VendorEntity> getbypage(int pgno,int pgsize)
{
	Page<VendorEntity> p = vr.findAll(PageRequest.of(pgno, pgsize));
	return p.getContent();
}

public List<VendorEntity> sortandpage(String name,int pgno,int pagesize)
{
	Sort sort = Sort.by(name).ascending();
	Page<VendorEntity> p = vr.findAll(PageRequest.of(pgno, pagesize, sort));
	return p.getContent();
}
public List<VendorEntity> sbytid()

{

	return vr.sortbytid();

}


public List<VendorEntity> retrivebynameandid(int id,String name){

	return vr.fetchByNameAndId(id,name);

}

public void deletebyjpqa(int id) {

	vr.deletemebyid(id);

	return;

}

public void changebyjpqa(int id1,int id2) {

	vr.updatemebyid(id1, id2);

	return;

}

}
