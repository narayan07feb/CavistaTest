package com.cavistatest.ext

import com.cavistatest.model.Data

fun Data.getImageUrl(): String {
    return if (this.images.isNullOrEmpty()) {
        this.link;
    } else {
        this.images[0].link;
    }


}
