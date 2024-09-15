import UserService from "../services/UserService";
import React from "react";
import "../css/table.css";
import Adminnavbar from "../navbar/admin_navbar";

class Earningreport extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      totalEarnings: "",
      moviename: localStorage.getItem("moviename")
    };
  }

  componentDidMount() {
    UserService.getEarnings().then(res => {
      var totalamount = 0;
      for (var i = 0; i < res.data.length; i++) {
        if (res.data[i].moviename == this.state.moviename) {
          //console.log(res.data[i].totalcost);
          let total_cost = parseInt(res.data[i].totalcost);
          totalamount = totalamount + total_cost;
        }
      }
      console.log(totalamount);
      this.setState({ totalEarnings: totalamount });
    });
  }

  render() {
    return (
      <div>
        <Adminnavbar />
        <h2 className="text-center" style={{ color: "white" }}>
          Movie List
        </h2>

        <br />
        <div className="row">
          <table className="table table-striped table-bordered" id="table">
            <thead>
              <tr>
                <th className="text-center">Movie Name</th>
                <th className="text-center">Total Earnings</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>
                  {this.state.moviename}
                </td>
                <td>
                  {this.state.totalEarnings}
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

export default Earningreport;
