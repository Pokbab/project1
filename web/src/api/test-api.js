import axios from "axios"

export default {
    get() {
        return axios.get('/')
    },
    post() {
        return axios.post('/')
    },
    put() {
        return axios.put('/')
    },
    delete() {
        return axios.delete('/')
    }
}