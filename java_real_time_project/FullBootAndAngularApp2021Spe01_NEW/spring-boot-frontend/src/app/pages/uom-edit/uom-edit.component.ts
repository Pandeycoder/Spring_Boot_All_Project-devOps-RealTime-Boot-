import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Uom } from 'src/app/models/uom';
import { UomService } from 'src/app/services/uom.service';

@Component({
  selector: 'app-uom-edit',
  templateUrl: './uom-edit.component.html',
  styleUrls: ['./uom-edit.component.css']
})
export class UomEditComponent implements OnInit {

  id: number = 0;
  uom: Uom = new Uom(0, '', '', '');

  constructor(private service: UomService, private activatedRoute: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    //read id on load
    this.id = this.activatedRoute.snapshot.params['id'];
    //fetch form data to show in edit page
    this.service.getOneUom(this.id)
      .subscribe(
        data => {
          this.uom = data;
        }, error => {
          console.log(error());
        });
  }

  updateUom() {
    this.service.updateOneUom(this.uom).subscribe(
      data => {
        console.log(data);
        this.router.navigate(['all']);
      }, error => {
        console.error(error);
      })
  }
}
