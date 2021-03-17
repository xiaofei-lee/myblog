import axios from 'axios'

axios.defaults.baseURL = '/blog';
axios.defaults.withCredentials = true; // true跨域  false不跨域

/**
 * request拦截器
 */
axios.interceptors.request.use(config => {
    return config
}, error => {
    return Promise.reject(error)
})


/**
 * response拦截器
 */
axios.interceptors.response.use(response => {
    return response
}, error => {
    return Promise.reject(error)
})


/**
 * 封装get方法
 * @param url
 * @param params
 * @param headers
 * @param responseType
 * @returns {Promise<unknown>}
 */
export function get(url, params = {}, headers = {}, responseType) {
    return new Promise((resolve, reject) => {
        axios.get(url, {
            params: params,
            headers: headers,
            responseType: responseType
        }).then(response => {
            resolve(response.data)
        }).catch(error => {
            reject(error)
        })
    })
}


/**
 * 封装post请求
 * @param url
 * @param data
 * @param headers
 * @param responseType
 * @returns {Promise<unknown>}
 */
export function post(url, data = {}, headers = {}, responseType) {
    return new Promise((resolve, reject) => {
        axios.post(url, data, {
            headers: headers,
            responseType: responseType
        }).then(response => {
            resolve(response.data)
        }).catch(error => {
            reject(error)
        })
    })
}

/**
 * 封装put请求
 * @param url
 * @param data
 * @param headers
 * @param responseType
 * @returns {Promise<unknown>}
 */
export function put(url, data = {}, headers, responseType) {
    return new Promise((resolve, reject) => {
        axios.put(url, data, {
            headers: headers,
            responseType: responseType
        }).then(response => {
            resolve(response.data)
        }).catch(error => {
            reject(error)
        })
    })
}
