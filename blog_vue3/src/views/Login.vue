<template>
    <div id="login">
        <particles></particles>

        <div class="loginForm">
            <div class="formTitle">
                登录
            </div>
            <el-form ref="loginForm" :model="loginUser" label-width="80px">
                <el-form-item label="用户名">
                    <el-input v-model="loginUser.username" placeholder="请输入用户名"></el-input>
                </el-form-item>
                <el-form-item label="密码">
                    <el-input type="password" v-model="loginUser.password" placeholder="请输入密码"></el-input>
                </el-form-item>
                <el-form-item>
                    <el-button type="primary" @click="login" class="loginButton">登录</el-button>
                </el-form-item>
            </el-form>
        </div>
    </div>
</template>

<script>
import Particles from "@/components/Particles/Particles";
import {userApi} from "@/api";

export default {
    name: "Login",
    components: {
        Particles
    },
    data: function () {
        return {
            loginUser: {
                username: '',
                password: ''
            }
        }
    },
    methods: {
        /**
         * 登录
         */
        login() {
            userApi.login({
                username: this.loginUser.username,
                password: this.loginUser.password
            }).then(res => {
                console.log(res);
                if (res.code === 200) {
                    this.$message.success(res.message);
                    this.$router.push('/');
                } else {
                    this.$message.error(res.message);
                }
            }).catch(err => {
                console.log(err);
            })
        }
    }
}
</script>

<style scoped>
#login {
    width: 100%;
    height: 100%;
}

.loginForm {
    width: 400px;
    height: 300px;
    background: #FFFFFF;
    border: 1px solid #eaeaea;
    border-radius: 5px;
    box-shadow: 0 0 25px #cac6c6;
    position: absolute;
    top: 50%;
    left: 50%;
    margin: -200px 0 0 -150px;
}

.loginForm .formTitle {
    width: 100%;
    height: 80px;
    font-size: 20px;
    text-align: center;
    line-height: 80px;
}

.loginForm .el-input {
    width: 280px;
}

.loginForm .loginButton {
    width: 280px;
}
</style>
