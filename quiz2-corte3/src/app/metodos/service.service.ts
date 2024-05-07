import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { Proveedor } from '../model/proveedor';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  proveedorURL = environment.apiResrURL + '/proveedor';

  constructor(private httpClient: HttpClient) {}
  
  public list(): Observable<Proveedor[]> {
    return this.httpClient.get<Proveedor[]>(this.proveedorURL);
  }

  public detail(id: number): Observable<Proveedor> {
    return this.httpClient.get<Proveedor>(this.proveedorURL + `/${id}`); 
  }

  public create(proveedor: Proveedor): Observable<Proveedor>{
    return this.httpClient.post<Proveedor>(this.proveedorURL, proveedor);
  }

  public update(id: string, proveedor: Proveedor): Observable<Proveedor>{
    return this.httpClient.put<Proveedor>(this.proveedorURL + `/${id}`, proveedor);
  }

  public delete(id: number): Observable<Proveedor> {
    return this.httpClient.delete<Proveedor>(this.proveedorURL + `/${id}`); 
  }
}
