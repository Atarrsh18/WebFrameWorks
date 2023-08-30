  package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.VendorEntity;
import com.example.demo.service.VendorService;

@RestController
public class VendorController {
@Autowired
VendorService vs;
@PostMapping("add")
public VendorEntity add(@RequestBody VendorEntity ve)
{
	return vs.saveinfo(ve);
}
@GetMapping("disp")
public List<VendorEntity> show()
{
	return vs.showinfo();
}
@PostMapping("addn")
public List<VendorEntity> addndetails(@RequestBody List<VendorEntity> ve)
{
	return vs.savedetails(ve);
}
@PutMapping("update")
public VendorEntity modify(@RequestBody VendorEntity ve)
{
	return vs.changeinfo(ve);
}
@DeleteMapping("del")
public String del(@RequestBody VendorEntity ve)
{
	vs.deleteinfo(ve);
	return "Deleted";
}
@DeleteMapping("delid/{id}")
public void deletemyid(@PathVariable int id)
{
	vs.deleteid(id);
}
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("getv/{id}")  
public Optional<VendorEntity> getVendor(@PathVariable int id)   
{  
         return vs.getVendorById(id);  
}  
@GetMapping("SortDetails/{str}")
public List<VendorEntity> getsortinfo(@PathVariable String str)
{
	 return vs.sortinfo(str);
}

@GetMapping("Paging/{pgno}/{pagesize}")
public List<VendorEntity> showpageinfo(@PathVariable int pgno,@PathVariable int pagesize)
{
	 return vs.getbypage(pgno, pagesize);
}

@GetMapping("SortAndPage/{pageno}/{pagesize}/{str}")
public List<VendorEntity> pageandsort(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String str)
{
	 return vs.sortandpage(str, pageno, pagesize);
}
@GetMapping("quer")
public List<VendorEntity> sortbytraid()

{
	return vs.sbytid();

}


@GetMapping("showvendorsbynameandid/{id}/{name}")

public List<VendorEntity> show2(@PathVariable int id,@PathVariable String name){

	return vs.retrivebynameandid(id,name);

}

@DeleteMapping("eraseq/{id}")

public void del4(@PathVariable int id) {

	vs.deletebyjpqa(id);

	return ;

}

@PutMapping("updatebyjpqa/{id1}/{id2}")

public void modifybyjpqa(@PathVariable int id1,@PathVariable int id2) {

	vs.changebyjpqa(id1, id2);

	return ;

}
}
