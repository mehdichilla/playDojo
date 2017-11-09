import React from 'react';

const NotFound = React.createClass({

  propTypes: {
    history: React.PropTypes.shape({
      push: React.PropTypes.func.isRequired
    })
  },
  contextTypes: {
    router: React.PropTypes.object
  },
  render() {
    return (
      <div className="row center-align">
        <h6>Erreur 404</h6>
        <h5>La page que vous recherchez n'existe pas !</h5>
      </div>
    );
  }
});

export default NotFound;
