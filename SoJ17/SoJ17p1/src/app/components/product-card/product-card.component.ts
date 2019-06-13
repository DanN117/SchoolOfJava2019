import {Component, Input, Output, EventEmitter, OnInit, OnChanges, SimpleChanges} from  '@angular/core';

@Component ({
    selector: 'app-product-card',
    templateUrl: 'product-card.component.html',
    styleUrls: ['product-card.component.css']
})

export class ProductCardComponent implements OnInit, OnChanges {

        @Input()
        productName: string;

        @Input()
        productDescription: string;

        @Output()
        productNameChanged: EventEmitter<string> = new EventEmitter();

        @Output()
        productDescriptionChanged: EventEmitter<string> = new EventEmitter();

        @Input()
        price: number;

        @Output()
        priceChange: EventEmitter<number> = new EventEmitter();

        resetValues(): void {
            const defaultValue = 'default value';
            this.productName = defaultValue;
            this.productDescription = defaultValue;

            this.productNameChanged.emit(defaultValue);
            this.productDescriptionChanged.emit(defaultValue);

            this.price = 0;
            this.priceChange.emit(0);
        }

        
    ngOnInit(): void {
        console.log('Product Card On Init');
    }

    ngOnChanges(changes: SimpleChanges): void {
        console.log('Product Card On Changes');
    }

}