import 'materialize-js';
import React from 'react';
import {browserHistory, IndexRoute, Route, Router} from 'react-router';
import {connect, Provider} from 'react-redux';
import {compose, createStore} from 'redux';
import reducer from './reducers';
import {DevTools} from './components/DevTools';
import {syncHistoryWithStore} from 'react-router-redux';
import {MainApp} from './components/MainApp';
import NotFound from './components/page/NotFound';
import $ from 'jquery';

const store = compose(DevTools.instrument())(createStore)(reducer);

export const App = React.createClass({
  propTypes: {
    history: React.PropTypes.object
  },
  componentDidMount() {
    $('select').material_select();
  },
  render(){
    const history = syncHistoryWithStore(this.props.history || browserHistory, store);
    return(
      <div>
        <Provider store={store}>
          <Router history={history}>
            <Route path="/" component={MainApp} >
              <IndexRoute component={Home} />
              <Route path="login" component={Login} />
              <Route path="*" component={NotFound} />
            </Route>
          </Router>
        </Provider>
      </div>
    );
  }
});
