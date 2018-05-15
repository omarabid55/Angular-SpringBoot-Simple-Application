import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';

import {Customer} from './customer.interface';

@Injectable()
export class CustomerService {

  private static readonly POST_CUSTOMER_URL = '/api/post/customer';
  private headers = new HttpHeaders({'Content-Type': 'application/json'});

  constructor(private http: HttpClient) {}

  createCustomer(customer: Customer): Observable<Customer> {
    return this.http.post(CustomerService.POST_CUSTOMER_URL, customer, {headers: this.headers});
  }
}
