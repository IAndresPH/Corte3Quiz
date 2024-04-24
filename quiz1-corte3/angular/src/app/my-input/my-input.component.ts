import { Component, OnInit, Input } from '@angular/core';


@Component({
  selector: 'app-my-input',
  templateUrl: './my-input.component.html',
  styleUrls: ['./my-input.component.css'],
})
export class MyInputComponent  implements OnInit {

    @Input() type: string = 'text';
    @Input() id: string = '';
    @Input() name: string = '';
    @Input() value: string = '';
    @Input() placeholder: string = '';
    @Input() clearInput: boolean = false;
    @Input() debounce: number = 0;
    @Input() disabled: boolean = false;
    @Input() maxlength: number = 0;
    @Input() min: number = 0;
    @Input() max: number = 0;
    @Input() step: number = 1;
  constructor() { }

  ngOnInit() {}

}
