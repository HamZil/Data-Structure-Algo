package code;

public abstract class SongComponent {
	// Will throw UnsupportedOperationException so that if it doesn't make sense for a song, or song group  to inherit a method they can just inherit the default implementation
	// This allows to add components
	public void add(SongComponent newSongComponent) {
	throw new UnsupportedOperationException();}
	// This allows to remove components
	public void remove(SongComponent newSongComponent) {
	throw new UnsupportedOperationException();}
	// This allows me to get components
	public SongComponent getComponent(int componentIndex) {
	throw new UnsupportedOperationException();}
	public String getSongName() {
		throw new UnsupportedOperationException();}
		// This allows to retrieve band names
		public String getBandName() {
		throw new UnsupportedOperationException();}
		// This allows to retrieve release year
		public int getReleaseYear() {
		throw new UnsupportedOperationException();}
		// When this is called by a class object that extends SongComponent it will print out information
		// specific to the Song or SongGroup
		public void displaySongInfo() {
		throw new UnsupportedOperationException();}
		}
