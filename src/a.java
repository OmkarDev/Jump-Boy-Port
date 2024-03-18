import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

//import javax.microedition.rms.RecordComparator;
//import javax.microedition.rms.RecordFilter;
//import javax.microedition.rms.RecordStore;

public final class a {
	int levels_reached;

	public final void loadLevelNo() {
		try {
			byte[] data = Files.readAllBytes(Paths.get(getClass().getResource("/data/data.bin").toURI()));
			this.levels_reached = data[1];
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
