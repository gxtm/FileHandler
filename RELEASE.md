# Release Process

This project has two GitHub Actions workflows for building and releasing the TodoApp JAR file.

## CI Workflow (maven.yml)

Runs on every push to `main` branch and on pull requests:
- Builds the project with Maven
- Uploads the JAR file as a workflow artifact
- Artifacts are available for download from the Actions tab

## Release Workflow (release.yml)

Triggers when a version tag is pushed (tags starting with `v`, e.g., `v1.0.0`, `v2.1.3`):
- Builds the project with Maven
- Creates a GitHub Release
- Attaches the JAR file to the release
- Generates release notes automatically

### Creating a Release

To create a new release:

1. Tag your commit with a version number:
   ```bash
   git tag v1.0.0
   git push origin v1.0.0
   ```

2. The workflow will automatically:
   - Build the JAR file
   - Create a GitHub Release with the tag
   - Upload the JAR to the release

3. The release will be visible at: `https://github.com/gxtm/FileHandler/releases`

### JAR File Details

- **Artifact Name**: `TodoApp-1.0-SNAPSHOT.jar`
- **Main Class**: `me.gixu.Main`
- **Java Version**: 17

### Running the JAR

After downloading the JAR from a release, run it with:
```bash
java -jar TodoApp-1.0-SNAPSHOT.jar
```
