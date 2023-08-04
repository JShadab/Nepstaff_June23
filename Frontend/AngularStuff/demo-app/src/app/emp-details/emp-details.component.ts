import { Component } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent {

  title: string = "Employee Details"

  public data: Employee[] = [
    {
      name: 'Abc',
      age: 23,
      salary: 1234
    },
    {
      name: 'Kbc',
      age: 28,
      salary: 4343
    },
    {
      name: 'Xyz',
      age: 27,
      salary: 2234
    },
    {
      name: 'PQR',
      age: 21,
      salary: 6789
    }
  ];

  public add() {
    let emp = {
      name: 'Musa',
      age: 21,
      salary: 6789
    };
    this.data.push(emp);
  }


  public delete(item: Employee) {
    console.log(item);

    this.data = this.data.filter(x => x.name != item.name);

    // let arr = [];

    // for (let x of this.data) {
    //   if (x.name != item.name) {
    //     arr.push(x);
    //   }
    // }

    // this.data = arr;
  }


}
