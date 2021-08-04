package com.zf.products;
import java.util.Scanner;



public class App 
{
    public static void main( String[] args )
    {
       
       int menuno=6;
       do {
    	   ListMenu();
    	   System.out.println("Yapmak istediğiniz işlem numarasını yazınız");
    	   Scanner scanner = new Scanner(System.in);
    	   menuno=scanner.nextInt();
    	   switch (menuno) {
    	   case 1:{
    		   System.out.println("Ürünün adı giriniz.");
    		   Product product=new Product();
    		   product.setName(scanner.next());
    		  
    		   
    		   ListContainer.urunliste.add(product);
    		   break;
    	   }
    	   case 2:{
    		   LıstProduct();
    		   break;
    	   }
    	   case 3:{
    		   addProductOffer(scanner);
    		   
    		   break;
    	   }
    	   case 4:{
    		   for (ProductOffer productoffer :  ListContainer.fiyatliste) {
    				System.out.println(productoffer.toString());
    				
    					break;
    				}
    		   }
    			
    		   
    		   
    	   
    		   
    	   case 5 :
    	   {
    		   break;
    	   }
    	   default:
               System.out.println( "Lütfen menüden geçerli bir seçenek giriniz" );
               break;
    	   
    		   
    	   
    	   
       }
    }
    	  while(menuno!=5);
    	  
          
          
    }

	private static void LıstProduct() {
		for (Product product :  ListContainer.urunliste) {
			System.out.println(product.toString());
		}
	}

	private static void ListMenu() {
		System.out.println("1.Ürün Ekle");
		   System.out.println("2.Ürünleri Listele");
		   System.out.println("3.Fiyat Ekle");
		   System.out.println("4.Fiyatları Listele");
		   System.out.println("5.Çıkış");
	}
	private static void addProductOffer(Scanner input) {
        System.out.println("Lütfen Şirket Adını Giriniz: ");
        String company_name = input.next();

        System.out.println("Lütfen Şirket Numarasını Giriniz: ");
        String phone = input.next();

        System.out.println("Lütfen Fiyat Girmek İstediğiniz Ürünün Id 'sini Giriniz: ");
        String productId = input.next();

        ProductOffer productOffer = new ProductOffer();
        productOffer.setCompanyName(company_name);
        productOffer.setPhone(phone);
        for (Product product : ListContainer.urunliste) {

            if (product.getID() == Integer.parseInt(productId)) {
                productOffer.setProduct(product);
                System.out.println(product.getName() + " ürünü için fiyat giriniz: ");
                break;
            }

        }
        String price = input.next();
        productOffer.setPrice(price);


        ListContainer.fiyatliste.add(productOffer);
        
	}
}





















