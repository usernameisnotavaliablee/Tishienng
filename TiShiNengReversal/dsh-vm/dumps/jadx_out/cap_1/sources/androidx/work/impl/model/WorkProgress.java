package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Entity(foreignKeys = {@androidx.room.ForeignKey(childColumns = {"work_spec_id"}, entity = androidx.work.impl.model.WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WorkProgress {

    @androidx.annotation.NonNull
    @androidx.room.ColumnInfo(name = "progress")
    public final androidx.work.Data mProgress;

    @androidx.annotation.NonNull
    @androidx.room.PrimaryKey
    @androidx.room.ColumnInfo(name = "work_spec_id")
    public final java.lang.String mWorkSpecId;

    public WorkProgress(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull androidx.work.Data r2) {
            r0 = this;
            r0.<init>()
            r0.mWorkSpecId = r1
            r0.mProgress = r2
            return
    }
}
