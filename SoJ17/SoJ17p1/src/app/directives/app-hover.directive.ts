import { Directive, HostListener, ElementRef, Renderer2, HostBinding, Input } from "@angular/core";

@Directive({
    selector: '[appHover]'
})

export class AppHoverDirective {

    @HostBinding('class.custom-class-hover')
    isHover = false;

    @Input()
    hoverDepth: number;

    constructor(private elementReference: ElementRef, private renderer: Renderer2) {
        
    }



    @HostListener('mouseenter')
    OnMouseEnter() {
        console.log('Mouse Enter!');

        this.renderer.addClass(this.elementReference.nativeElement, 'mat-elevation-z4');

        this.isHover = true;
    }

    @HostListener('mouseleave')
    OnMouseLeave() {
        console.log('Mouse Leave!');

        this.renderer.removeClass(this.elementReference.nativeElement, 'mat-elevation-z4');

        this.isHover = false;
    }
}