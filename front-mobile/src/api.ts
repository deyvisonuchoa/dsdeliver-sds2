import axios from "axios"

const API_URL = 'https://ws-dsdeliver.herokuapp.com';
// const API_URL = 'http://192.168.1.101:8080';
// const mapboxToken = process.env.REACT_APP_ACCESS_TOKEN_MAP_BOX;

export var fetchOrders = () => {
    return axios(`${API_URL}/orders`);
}

export var confirmDelivery = (orderId: number) => { 
    return axios.put(`${API_URL}/orders/${orderId}/delivered`);
}