import './App.css';

function App() {
  return (
      <div className="App">
          <div className="Todo-App">
              <form>
                  <input type="text"/>
              </form>
              <div className="Todo-List">
                  <ul>
                      <li>
                          <input type="checkbox"/> Create Static UI
                      </li>
                      <li>
                          <input type="checkbox"/> Create Initial State
                      </li>
                      <li>
                          <input type="checkbox"/> Use state to render UI
                      </li>
                  </ul>
              </div>
          </div>
      </div>
  );
}

export default App;
