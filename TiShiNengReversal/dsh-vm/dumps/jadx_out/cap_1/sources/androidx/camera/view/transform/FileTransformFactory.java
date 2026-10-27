package androidx.camera.view.transform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.camera.view.TransformExperimental
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FileTransformFactory {
    private boolean mUsingExifOrientation;

    public FileTransformFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public androidx.camera.view.transform.OutputTransform getOutputTransform(@androidx.annotation.NonNull android.content.ContentResolver r1, @androidx.annotation.NonNull android.net.Uri r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = r1.openInputStream(r2)
            androidx.camera.view.transform.OutputTransform r2 = r0.getOutputTransform(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto Ld
            r1.close()
        Ld:
            return r2
        Le:
            r2 = move-exception
            if (r1 == 0) goto L19
            r1.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r1 = move-exception
            r2.addSuppressed(r1)
        L19:
            throw r2
    }

    @androidx.annotation.NonNull
    public androidx.camera.view.transform.OutputTransform getOutputTransform(@androidx.annotation.NonNull java.io.File r2) throws java.io.IOException {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            androidx.camera.view.transform.OutputTransform r2 = r1.getOutputTransform(r0)     // Catch: java.lang.Throwable -> Ld
            r0.close()
            return r2
        Ld:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            r2.addSuppressed(r0)
        L16:
            throw r2
    }

    @androidx.annotation.NonNull
    public androidx.camera.view.transform.OutputTransform getOutputTransform(@androidx.annotation.NonNull java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            androidx.camera.core.impl.utils.Exif r5 = androidx.camera.core.impl.utils.Exif.createFromInputStream(r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r5.getWidth()
            int r2 = r5.getHeight()
            r3 = 0
            r0.<init>(r3, r3, r1, r2)
            android.graphics.Matrix r1 = androidx.camera.core.impl.utils.TransformUtils.getNormalizedToBuffer(r0)
            boolean r2 = r4.mUsingExifOrientation
            if (r2 == 0) goto L2d
            int r2 = r5.getOrientation()
            int r3 = r5.getWidth()
            int r5 = r5.getHeight()
            android.graphics.Matrix r5 = androidx.camera.core.impl.utils.TransformUtils.getExifTransform(r2, r3, r5)
            r1.postConcat(r5)
        L2d:
            androidx.camera.view.transform.OutputTransform r5 = new androidx.camera.view.transform.OutputTransform
            android.util.Size r0 = androidx.camera.core.impl.utils.TransformUtils.rectToSize(r0)
            r5.<init>(r1, r0)
            return r5
    }

    public boolean isUsingExifOrientation() {
            r1 = this;
            boolean r0 = r1.mUsingExifOrientation
            return r0
    }

    public void setUsingExifOrientation(boolean r1) {
            r0 = this;
            r0.mUsingExifOrientation = r1
            return
    }
}
