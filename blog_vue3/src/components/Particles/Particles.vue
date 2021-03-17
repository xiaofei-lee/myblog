<template>
    <div id="Particles">
        <div id="particles-js"></div>
    </div>
</template>

<script>
import 'particles.js'
import particlesConfig from './particles.json'

export default {
    name: "Particles",
    data() {
        return {}
    },
    mounted() {
        this.init();
    },
    methods: {
        init() {
            window.particlesJS('particles-js', particlesConfig);
        }
    }
}
</script>

<style scoped>
@import "./style.css";

#Particles {
    height: 100%;
    min-height: 730px;
}
</style>
