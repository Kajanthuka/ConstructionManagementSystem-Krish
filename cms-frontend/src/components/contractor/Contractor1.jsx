import React from 'react'
import bootstrap from 'bootstrap'

const Contractor1 = () => {
  return (
    <div>

            {/* <!-- Button trigger modal --> */}

{/* <!-- Modal --> */}
<div class="modal fade" id="add" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Consult the client</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        
        <form>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1"/>
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1"/>
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
        <h1>Contractor</h1>
        <div className="row">
            <div className="col-12">
                <div className="card">
                    <div className="card_body">
                
                        <div>
                           <div className="row">
                               <div className="col-md-12">
                                   <br />
                                    <button class='btn btn-success badge-pill ' data-bs-toggle="modal" data-bs-target="#add"> Add</button>
                                    <br />
                               </div>
                               <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
      <td><button class='btn btn-primary badge-pill ' data-bs-toggle="modal" data-bs-target="#add"> Edit</button>   <button type="button" class="btn btn-danger">Delete</button> <br />

</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
      <td><button class='btn btn-primary badge-pill ' data-bs-toggle="modal" data-bs-target="#add"> Edit</button>   <button type="button" class="btn btn-danger">Delete</button> <br /></td>

    </tr>
    <tr>
      <th scope="row">3</th>
      <td colspan="2">Larry the Bird</td>
      <td>@twitter</td>
      <td><button class='btn btn-primary badge-pill ' data-bs-toggle="modal" data-bs-target="#add"> Edit</button>   <button type="button" class="btn btn-danger">Delete</button> <br /></td>

    </tr>
  </tbody>
</table>
                           </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div className="row">
            <div className="col-16">
                <div className="card">
                    <div className="card-body">
                        <h3>See the Updates</h3>
                    <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="..." class="d-block w-100" alt="..."/>
    </div>
    <div class="carousel-item">
      <img src="..." class="d-block w-100" alt="..."/>
    </div>
    <div class="carousel-item">
      <img src="..." class="d-block w-100" alt="..."/>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>

</div>
                    </div>
                </div>
            </div>
            <div className="col-10">
                
            </div>
            
        </div>

        
        
    </div>

    
  )
}

export default Contractor1