package kodlama.io.rentACar.webApi.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.rentACar.businness.abstracts.BrandServices;
import kodlama.io.rentACar.entity.concretes.Brand;

@RestController //controller class'ı olduğunu belirtiyoruz spring özelliği
@RequestMapping("/api/brands")//Ana adres
public class BrandsController 
{
	//field
	private BrandServices brandServices;
	
	@Autowired //brandServices hangi sınıf(brandManager) implemente ediyorsa onu otomatik newle
	//Not: *Springin yeni versiyonlarında Autowired otomatik aktiftir.
	//constructorParamteres
	public BrandsController(BrandServices brandServices) 
	{
		this.brandServices = brandServices;
	}
	
	@GetMapping("/getAll") //GetAll Url
	//controllerGetAll
	public List<Brand> getAll()
	{
		return brandServices.getAll();
	}
}
