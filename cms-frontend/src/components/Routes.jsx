import React from 'react'
import { Route,Switch } from 'react-router-dom'
import Dashboard from '../pages/Dashboard'
import Customer from '../pages/Customer'
import Project from '../pages/Project'
import Design  from '../pages/Design'
import { Employee } from '../pages/Employee'
import Contractor from '../pages/Contractor'
import Consultant from '../pages/Consultant'
import ChatBot from '../pages/ChatBot'




export const Routes = () => {
  return (
    <Switch>
        <Route path = '/' exact component={Dashboard}></Route>
        <Route path = '/customer' component={Customer}></Route>
        <Route path = '/project' component={Project}></Route>
         <Route path = '/design' component={Design}></Route>
         <Route path = '/employee' component={Employee}></Route>
         <Route path = '/contractor' component={Contractor}></Route>
         <Route path = '/consultant' component={Consultant}></Route>
         <Route path = '/chatbot' component={ChatBot}></Route>

        {/* 
        <Route path = '/inventory' component={Inventory}></Route>
        <Route path = '/settings' component={Setting}></Route>   */}




        
        
    </Switch>
    
  )
}
