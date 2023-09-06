import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import SignUp from './RegistrationForm';
import SignIn from './SignIn';

const Routers: React.FC = () => {
    return (
        <Router>
            <Routes>
                <Route path="/register" Component={SignUp} />
                <Route path="/signin" Component={SignIn} />
                {/* Add more routes as needed */}
            </Routes>
        </Router>
    );
};

export default Routers;
