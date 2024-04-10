import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Uom } from 'src/app/models/uom';
import { UomService } from 'src/app/services/uom.service';

@Component({
  selector: 'app-uom',
  templateUrl: './uom.component.html',
  styleUrls: ['./uom.component.css'],
})
export class UomComponent implements OnInit {
  //variables
  uoms?: Uom[];
  message?: string;

  //injection
  constructor(private service: UomService, private router: Router) { }

  //methods
  ngOnInit(): void {
    this.getAllUoms();
  }

  getAllUoms() {
    this.service.getAllUoms().subscribe(
      (data) => {
        this.uoms = data;
      },
      (error) => {
        console.log(error);
      }
    );
  }

  deleteUom(id: number) {
    let status = confirm('Do you want to delete ' + id);
    if (status) {
      this.service.deleteUom(id).subscribe(
        (data) => {
          this.message = data;
          this.getAllUoms();
        },
        (error) => {
          console.log(error);
        }
      );
    } else {
      this.message = "Delete cancelled for " + id;
    }
  }

  //goto edit component
  editUom(id: number) {
    this.router.navigate(['edit',id]);
  }
}
