import React from 'react';
import { Route, Switch } from 'react-router-dom';
import Search from './components/Search';

function App() {
  return (
    <div className="App">
      <Switch>
        <Route path="/search">
          <Search />
        </Route>
        <Route path="/">
          <h1>Welcome to the Book Recommendation System</h1>
        </Route>
      </Switch>
    </div>
  );
}

export default App;
