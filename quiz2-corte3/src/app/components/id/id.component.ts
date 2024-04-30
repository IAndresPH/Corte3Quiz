import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-id',
  templateUrl: './id.component.html',
  styleUrls: ['./id.component.css'],
})
export class IdComponent  implements OnInit {
  @Input() id!: string; // Obligatorio
  @Input() type!: string; // Tipo predeterminado
  @Input() name!: string;
  @Input() placeholder!: string;
  @Input() labelPlacement!: string;
  @Input() autocomplete!: string;
  constructor() { }

  ngOnInit() {}

}
