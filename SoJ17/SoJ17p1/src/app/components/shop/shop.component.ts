import {Component, OnInit} from  '@angular/core';
import { Product } from '../product-card-reference/product.model';

@Component ({
    selector: 'app-shop',
    templateUrl: 'shop.component.html',
    styleUrls: ['shop.component.css']
})

export class ShopComponent implements OnInit {

    product1Name = 'Product 1 Name';
    product2Name = 'Product 2 Name';
    product3Name = 'Product 3 Name';
    price1 = 300;
    
    product1Description = 'Product 1 Description';
    product2Description = 'Product 2 Description';
    product3Description = 'Product 3 Description';

    mockProduct: Product = {
        price: 100,
        name: 'Mock Name',
        description: 'Mock description'
    }


 

    handleProduct1NameChanged(updatedProductName: string) {
        this.product1Name = updatedProductName;
    }

    handleProduct1DescriptionChanged(updatedProductDescription: string) {
        this.product1Description = updatedProductDescription;
    }

    handleProduct2NameChanged(updatedProductName: string) {
        this.product2Name = updatedProductName;
    }

    handleProduct2DescriptionChanged(updatedProductDescription: string) {
        this.product2Description = updatedProductDescription;
    }

    handleProduct3NameChanged(updatedProductName: string) {
        this.product3Name = updatedProductName;
    }

    handleProduct3DescriptionChanged(updatedProductDescription: string) {
        this.product3Description = updatedProductDescription;
    }

    decreaseProductPrice() {
        this.mockProduct.price -= 1;
    }

    
    ngOnInit(): void {
        console.log('OnInit!!!');
        
        
    }

}