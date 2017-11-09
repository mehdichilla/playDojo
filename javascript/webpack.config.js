var webpack = require('webpack');

module.exports = {
    output: {
        path: './../public/javascripts/',
        publicPath: '/javascripts/',
        filename: 'bundle.js'
    },
    entry: {
        app: ['./src/Index.js']
    },
    resolve: {
        extensions: ['', '.js', '.jsx']
    },
    plugins: [
        new webpack.DefinePlugin({
            '__DEV__': process.env.NODE_ENV === 'production' ? false : true,
            'process.env': {
                NODE_ENV: JSON.stringify(process.env.NODE_ENV || 'dev')
            }
        })
    ],
    module: {
        loaders: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                loader: 'babel'
            }
        ]
    }
};
