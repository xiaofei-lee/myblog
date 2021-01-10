module.exports = {
    // 如果你不需要生产环境的 source map，可以将其设置为 false 以加速生产环境构建
    productionSourceMap: false,
    devServer: {
        // 开发端口
        port: '9001',
        // 在开发环境下将API请求代理到API服务器
        proxy: {
            '/blog': {
                target: 'http://127.0.0.1:9002/blog',
                changeOrigin: true,
                pathRewrite: {
                    '^/blog': '/'
                }
            }
        }
    }
}
