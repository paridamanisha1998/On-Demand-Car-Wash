import React from 'react';
import web from "../src/Images/Car Wash.gif";
import { NavLink } from 'react-router-dom';
const Home=()=> {
    return (
      <>
           <section id="header" className="">
             <div className="container-fluid">
               <div className="row">
                 <div className="col-10 mx-auto">
                   <div className="row">
                   <div className="col-md-6 pt-5 pt-lg-0 order-2 order-lg-1 d-flex justify-content-center flex-column">
                     <h1><strong className="brand-name">CarWash</strong></h1>
                     <h2 className="my-3">We come to you, at work or at home, for full car wash and detailing services</h2>
                     <div className="mt-3">
                       <NavLink to="/service" className="btn-get-stared">
                         Get Started
                       </NavLink>
                     </div>
                   </div>
                   <div className="col-lg-6 order-1 order-lg-2 header-img">
                     <img src={web} className="img-fluid animated" alt="homepage" />
                   </div>
                   </div>
                 </div>
               </div>
             </div>

           </section>
      </>   
    )
};

export default Home;
