import {post} from "../utils/http";

export default class UserApi {
    /**
     * 登录
     * @param data
     * @returns {Promise<minimist.Opts.unknown>}
     */
    login = data => {
        return post('/user/login', data);
    }
    /**
     * 退出登录
     * @param data
     * @returns {Promise<minimist.Opts.unknown>}
     */
    logout = data => {
        return post('/user/logout', data);
    }
    /**
     * 获取已登录用户信息
     * @param data
     * @returns {Promise<minimist.Opts.unknown>}
     */
    getLoginUser = data => {
        return post('/user/loginUser', data);
    }
}
