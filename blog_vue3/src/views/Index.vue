<template>
    <div id="index">
        <el-header>
            <indexHeader></indexHeader>
        </el-header>
    </div>
</template>

<script>
import indexHeader from "@/views/index/Header";

export default {
    name: "Index",
    components: {
        indexHeader
    }
}
</script>

<style scoped>
#index {
    width: 100%;
    height: 100%;
}
</style>
