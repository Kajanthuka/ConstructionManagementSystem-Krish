import React from 'react'
import Table from '../table/Table'
import customerList from '../../assets/JsonData/customers-list.json';

const customerTableHead = [
    '',
    'name',
    'email',
    'phone',
    'total orders',
    'total spend',
    'location'
  ]

  const renderHead = (item, index) => <th key={index}>{item}</th>

const renderBody = (item, index) => (
    <tr key={index}>
        <td>{item.id}</td>
        <td>{item.name}</td>
        <td>{item.email}</td>
        <td>{item.phone}</td>
        <td>{item.total_orders}</td>
        <td>{item.total_spend}</td>
        <td>{item.location}</td>
    </tr>
)


export const Engineer = () => {
  return (
    <div>
        <h2 className="page-header">Employees </h2>  
        <div className="row">
            <div className="col-12">
                <div className="card">
                    <div className="card_body">
                    <Table 
                     limit='5'
                     headData={customerTableHead}
                     renderHead={(item, index) => renderHead(item, index)}
                     bodyData={customerList}
                     renderBody={(item, index) => renderBody(item, index)}
                  
                  />
                    </div>
                </div>
            </div>
        </div>

        <div className="row">
            <div className="col-10">
                <div className="card">
                    <div className="card_body">
                    <div class="modal-body">
                       
                        <from>
                        <div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Email address</label>
  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com"/>
</div>
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">Type Comment </label>
  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
  <br />
  <button type="button" class="btn btn-primary">submit</button>
</div>
                        </from>
</div>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
  )
}
