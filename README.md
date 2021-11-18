Flow-Designer
=============

This is the Flow Designer 1.10 sample for Sirius-Web. 

The following diagrams are supported by Sirius-Web :
- Topography
- Topography with auto-layout
- Topography unsynchronized
    - Root Data Source elements are unsynchronized
        - tools are available to create or add existing Data Sources
    - Root Composite Processor elements are unsynchronized
        - tools are available to create or add existing Composite Processors
        - Processor sub-nodes are unsynchronized
            - a specific delete tool is available: it replaces the generic delete tools in sirius-web.
        - Fan sub-nodes are synchronized
        - Data Source sub-nodes are synchronized
        - Power Input bordered-nodes are synchronized
        - Power Output bordered-nodes are synchronized
    - No Delete tool for unsynchronized root Data Sources & Composite Processors: sirius-web provides generic delete from model tool & delete from diagram tool.