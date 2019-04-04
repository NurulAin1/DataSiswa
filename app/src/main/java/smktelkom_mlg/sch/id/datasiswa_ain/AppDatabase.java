package smktelkom_mlg.sch.id.datasiswa_ain;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {SiswaModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SiswaDao userDao();
}

