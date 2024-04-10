import { Component, OnInit } from '@angular/core';
import { Uom } from 'src/app/models/uom';
import { UomService } from 'src/app/services/uom.service';

@Component({
  selector: 'app-uom-create',
  templateUrl: './uom-create.component.html',
  styleUrls: ['./uom-create.component.css'],
})
export class UomCreateComponent implements OnInit {
  //Form backing object
  uom: Uom = new Uom(0, '', '', '');
  message?: string;

  //Injection
  constructor(private service: UomService) {}

  ngOnInit(): void {}

  //on click submit
  createUom() {
    this.service.createUom(this.uom).subscribe(
      (data) => {
        this.message = data;
        //reset form data after save
        this.uom = new Uom(0, '', '', '');
      },
      (error) => {
        console.log(error);
      }
    );
  }
}
