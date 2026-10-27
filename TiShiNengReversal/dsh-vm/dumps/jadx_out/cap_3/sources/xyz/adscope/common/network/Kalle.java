package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class Kalle {
    private static xyz.adscope.common.network.KalleConfig a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Download {
        public Download() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void cancel(java.lang.Object r1) {
                xyz.adscope.common.network.download.DownloadManager r0 = xyz.adscope.common.network.download.DownloadManager.getInstance()
                r0.cancel(r1)
                return
        }

        public static xyz.adscope.common.network.download.BodyDownload.Api delete(java.lang.String r1) {
                xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
                xyz.adscope.common.network.Url r1 = r1.build()
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.DELETE
                xyz.adscope.common.network.download.BodyDownload$Api r1 = xyz.adscope.common.network.download.BodyDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.BodyDownload.Api delete(xyz.adscope.common.network.Url r1) {
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.DELETE
                xyz.adscope.common.network.download.BodyDownload$Api r1 = xyz.adscope.common.network.download.BodyDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.UrlDownload.Api get(java.lang.String r1) {
                xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
                xyz.adscope.common.network.Url r1 = r1.build()
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.GET
                xyz.adscope.common.network.download.UrlDownload$Api r1 = xyz.adscope.common.network.download.UrlDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.UrlDownload.Api get(xyz.adscope.common.network.Url r1) {
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.GET
                xyz.adscope.common.network.download.UrlDownload$Api r1 = xyz.adscope.common.network.download.UrlDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.UrlDownload.Api head(java.lang.String r1) {
                xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
                xyz.adscope.common.network.Url r1 = r1.build()
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.HEAD
                xyz.adscope.common.network.download.UrlDownload$Api r1 = xyz.adscope.common.network.download.UrlDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.UrlDownload.Api head(xyz.adscope.common.network.Url r1) {
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.HEAD
                xyz.adscope.common.network.download.UrlDownload$Api r1 = xyz.adscope.common.network.download.UrlDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.UrlDownload.Api options(java.lang.String r1) {
                xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
                xyz.adscope.common.network.Url r1 = r1.build()
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.OPTIONS
                xyz.adscope.common.network.download.UrlDownload$Api r1 = xyz.adscope.common.network.download.UrlDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.UrlDownload.Api options(xyz.adscope.common.network.Url r1) {
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.OPTIONS
                xyz.adscope.common.network.download.UrlDownload$Api r1 = xyz.adscope.common.network.download.UrlDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.BodyDownload.Api patch(java.lang.String r1) {
                xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
                xyz.adscope.common.network.Url r1 = r1.build()
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.PATCH
                xyz.adscope.common.network.download.BodyDownload$Api r1 = xyz.adscope.common.network.download.BodyDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.BodyDownload.Api patch(xyz.adscope.common.network.Url r1) {
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.PATCH
                xyz.adscope.common.network.download.BodyDownload$Api r1 = xyz.adscope.common.network.download.BodyDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.BodyDownload.Api post(java.lang.String r1) {
                xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
                xyz.adscope.common.network.Url r1 = r1.build()
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.POST
                xyz.adscope.common.network.download.BodyDownload$Api r1 = xyz.adscope.common.network.download.BodyDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.BodyDownload.Api post(xyz.adscope.common.network.Url r1) {
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.POST
                xyz.adscope.common.network.download.BodyDownload$Api r1 = xyz.adscope.common.network.download.BodyDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.BodyDownload.Api put(java.lang.String r1) {
                xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
                xyz.adscope.common.network.Url r1 = r1.build()
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.PUT
                xyz.adscope.common.network.download.BodyDownload$Api r1 = xyz.adscope.common.network.download.BodyDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.BodyDownload.Api put(xyz.adscope.common.network.Url r1) {
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.PUT
                xyz.adscope.common.network.download.BodyDownload$Api r1 = xyz.adscope.common.network.download.BodyDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.UrlDownload.Api trace(java.lang.String r1) {
                xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
                xyz.adscope.common.network.Url r1 = r1.build()
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.TRACE
                xyz.adscope.common.network.download.UrlDownload$Api r1 = xyz.adscope.common.network.download.UrlDownload.newApi(r1, r0)
                return r1
        }

        public static xyz.adscope.common.network.download.UrlDownload.Api trace(xyz.adscope.common.network.Url r1) {
                xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.TRACE
                xyz.adscope.common.network.download.UrlDownload$Api r1 = xyz.adscope.common.network.download.UrlDownload.newApi(r1, r0)
                return r1
        }
    }

    private Kalle() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void cancel(java.lang.Object r1) {
            xyz.adscope.common.network.simple.RequestManager r0 = xyz.adscope.common.network.simple.RequestManager.getInstance()
            r0.cancel(r1)
            return
    }

    public static xyz.adscope.common.network.simple.SimpleBodyRequest.Api delete(java.lang.String r1) {
            xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
            xyz.adscope.common.network.Url r1 = r1.build()
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.DELETE
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r1 = xyz.adscope.common.network.simple.SimpleBodyRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleBodyRequest.Api delete(xyz.adscope.common.network.Url r1) {
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.DELETE
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r1 = xyz.adscope.common.network.simple.SimpleBodyRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleUrlRequest.Api get(java.lang.String r1) {
            xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
            xyz.adscope.common.network.Url r1 = r1.build()
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.GET
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r1 = xyz.adscope.common.network.simple.SimpleUrlRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleUrlRequest.Api get(xyz.adscope.common.network.Url r1) {
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.GET
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r1 = xyz.adscope.common.network.simple.SimpleUrlRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.KalleConfig getConfig() {
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.a
            return r0
    }

    public static xyz.adscope.common.network.simple.SimpleUrlRequest.Api head(java.lang.String r1) {
            xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
            xyz.adscope.common.network.Url r1 = r1.build()
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.HEAD
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r1 = xyz.adscope.common.network.simple.SimpleUrlRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleUrlRequest.Api head(xyz.adscope.common.network.Url r1) {
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.HEAD
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r1 = xyz.adscope.common.network.simple.SimpleUrlRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleUrlRequest.Api options(java.lang.String r1) {
            xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
            xyz.adscope.common.network.Url r1 = r1.build()
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.OPTIONS
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r1 = xyz.adscope.common.network.simple.SimpleUrlRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleUrlRequest.Api options(xyz.adscope.common.network.Url r1) {
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.OPTIONS
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r1 = xyz.adscope.common.network.simple.SimpleUrlRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleBodyRequest.Api patch(java.lang.String r1) {
            xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
            xyz.adscope.common.network.Url r1 = r1.build()
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.PATCH
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r1 = xyz.adscope.common.network.simple.SimpleBodyRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleBodyRequest.Api patch(xyz.adscope.common.network.Url r1) {
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.PATCH
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r1 = xyz.adscope.common.network.simple.SimpleBodyRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleBodyRequest.Api post(java.lang.String r1) {
            xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
            xyz.adscope.common.network.Url r1 = r1.build()
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.POST
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r1 = xyz.adscope.common.network.simple.SimpleBodyRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleBodyRequest.Api post(xyz.adscope.common.network.Url r1) {
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.POST
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r1 = xyz.adscope.common.network.simple.SimpleBodyRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleBodyRequest.Api put(java.lang.String r1) {
            xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
            xyz.adscope.common.network.Url r1 = r1.build()
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.PUT
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r1 = xyz.adscope.common.network.simple.SimpleBodyRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleBodyRequest.Api put(xyz.adscope.common.network.Url r1) {
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.PUT
            xyz.adscope.common.network.simple.SimpleBodyRequest$Api r1 = xyz.adscope.common.network.simple.SimpleBodyRequest.newApi(r1, r0)
            return r1
    }

    public static void setConfig(xyz.adscope.common.network.KalleConfig r2) {
            xyz.adscope.common.network.KalleConfig r0 = xyz.adscope.common.network.Kalle.a
            if (r0 != 0) goto L26
            java.lang.Class<xyz.adscope.common.network.KalleConfig> r0 = xyz.adscope.common.network.KalleConfig.class
            monitor-enter(r0)
            xyz.adscope.common.network.KalleConfig r1 = xyz.adscope.common.network.Kalle.a     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L1b
            if (r2 != 0) goto L18
            xyz.adscope.common.network.KalleConfig$Builder r2 = xyz.adscope.common.network.KalleConfig.newBuilder()     // Catch: java.lang.Throwable -> L16
            xyz.adscope.common.network.KalleConfig r2 = r2.build()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L24
        L18:
            xyz.adscope.common.network.Kalle.a = r2     // Catch: java.lang.Throwable -> L16
            goto L22
        L1b:
            java.lang.String r2 = "Kalle"
            java.lang.String r1 = "Only allowed to configure once."
            xyz.adscope.common.tool.LogUtil.d(r2, r1)     // Catch: java.lang.Throwable -> L16
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
        L26:
            return
    }

    public static xyz.adscope.common.network.simple.SimpleUrlRequest.Api trace(java.lang.String r1) {
            xyz.adscope.common.network.Url$Builder r1 = xyz.adscope.common.network.Url.newBuilder(r1)
            xyz.adscope.common.network.Url r1 = r1.build()
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.TRACE
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r1 = xyz.adscope.common.network.simple.SimpleUrlRequest.newApi(r1, r0)
            return r1
    }

    public static xyz.adscope.common.network.simple.SimpleUrlRequest.Api trace(xyz.adscope.common.network.Url r1) {
            xyz.adscope.common.network.RequestMethod r0 = xyz.adscope.common.network.RequestMethod.TRACE
            xyz.adscope.common.network.simple.SimpleUrlRequest$Api r1 = xyz.adscope.common.network.simple.SimpleUrlRequest.newApi(r1, r0)
            return r1
    }
}
