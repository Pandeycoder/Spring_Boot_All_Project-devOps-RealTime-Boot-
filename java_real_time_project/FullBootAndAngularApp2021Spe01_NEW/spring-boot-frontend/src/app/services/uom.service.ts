import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Uom } from '../models/uom';
import { environment } from 'src/environments/environment';

const baseUrl = environment.baseUrl;

@Injectable({
  providedIn: 'root',
})
export class UomService {
  // Inject HTTP Client to make HTTP calls
  constructor(private http: HttpClient) { }

  // get all rows from backend
  getAllUoms(): Observable<Uom[]> {
    return this.http.get<Uom[]>(`${baseUrl}/uom/all`);
  }

  deleteUom(id: number): Observable<any> {
    return this.http.delete(`${baseUrl}/uom/remove/${id}`, {
      responseType: 'text',
    });
  }

  createUom(uom: Uom): Observable<any> {
    return this.http.post(`${baseUrl}/uom/create`, uom, {
      responseType: 'text',
    });
  }

  getOneUom(id: number): Observable<Uom> {
    return this.http.get<Uom>(`${baseUrl}/uom/fetch/${id}`);
  }

  updateOneUom(uom: Uom): Observable<any> {
    return this.http.put(`${baseUrl}/uom/modify`, uom, {
      responseType: 'text',
    });
  }

}
