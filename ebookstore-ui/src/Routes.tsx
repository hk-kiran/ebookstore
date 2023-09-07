import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import SignUp from './RegistrationForm';
import SignIn from './SignIn';
import HomePage from './Homepage';
import Error from './404';

const Routers: React.FC = () => {
    return (
        <Router>
            <Routes>
                <Route path="/register" Component={SignUp} />
                <Route path="/signin" Component={SignIn} />
                <Route path="/app" Component={HomePage} />
                <Route path="/404-not-found" Component={Error} />
            </Routes>
        </Router>
    );
};

export default Routers;
